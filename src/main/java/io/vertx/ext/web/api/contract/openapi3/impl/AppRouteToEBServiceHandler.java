package io.vertx.ext.web.api.contract.openapi3.impl;

import java.util.function.Function;

import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.Tracer.SpanBuilder;
import io.opentracing.contrib.vertx.ext.web.TracingHandler;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.api.contract.impl.RouteToEBServiceHandler;

public class AppRouteToEBServiceHandler extends RouteToEBServiceHandler {

	Tracer tracer;

	public AppRouteToEBServiceHandler(EventBus eventBus, String address, DeliveryOptions deliveryOptions,
			Function<RoutingContext, JsonObject> extraOperationContextPayloadMapper, Tracer tracer) {
		super(eventBus, address, deliveryOptions, extraOperationContextPayloadMapper);
		this.tracer = tracer;
	}

	@Override
	public void handle(RoutingContext routingContext) {
		SpanBuilder spanBuilder = tracer.buildSpan("doingStuff");
		spanBuilder.asChildOf(TracingHandler.serverSpanContext(routingContext));
		Span span = spanBuilder.start();
		super.handle(routingContext);
		span.finish();
	}

	public static RouteToEBServiceHandler build(EventBus eventBus, String address, String actionName,
			Function<RoutingContext, JsonObject> extraOperationContextPayloadMapper, Tracer tracer) {
		return new AppRouteToEBServiceHandler(eventBus, address, new DeliveryOptions().addHeader("action", actionName),
				extraOperationContextPayloadMapper, tracer);
	}

	public static RouteToEBServiceHandler build(EventBus eventBus, String address, String actionName,
			JsonObject deliveryOptions, Function<RoutingContext, JsonObject> extraOperationContextPayloadMapper, Tracer tracer) {
		DeliveryOptions opt = new DeliveryOptions(deliveryOptions).addHeader("action", actionName);
		return new AppRouteToEBServiceHandler(eventBus, address, opt, extraOperationContextPayloadMapper, tracer);
	}

}
