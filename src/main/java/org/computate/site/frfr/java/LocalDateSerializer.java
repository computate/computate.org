package org.computate.site.frfr.java;

import java.io.IOException;
import java.time.LocalDate;

import org.computate.site.frfr.page.MiseEnPage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateSerializer extends JsonSerializer<LocalDate> {

	/**
	 * r: MiseEnPage
	 * r.enUS: PageLayout
	 * r: FORMATDateAffichage
	 * r.enUS: FORMATDateDisplay
	 */
	@Override
	public void serialize(LocalDate o, JsonGenerator generator, SerializerProvider provider) throws IOException {
		generator.writeString(MiseEnPage.FORMATDateAffichage.format(o));
	}
}
