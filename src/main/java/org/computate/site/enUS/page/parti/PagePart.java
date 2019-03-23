package org.computate.site.enUS.page.parti;

import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.requete.RequeteSiteEnUS;

public abstract class PagePart extends PagePartGen<Cluster> {

	protected void _page_(Couverture<MiseEnPage> c) {}

	public abstract void  htmlBody();
	public abstract void  htmlBodyCourt();
	protected void _partiVar(Couverture<String> c) {}

	public void  shAvantClasseJavaChamp() {
	}

	public void  shAvantPageParti() {}

	public void  shApresPageParti() {}

	public void  shHtmlAvantPageParti() {}

	public void  shHtmlApresPageParti() {}

	public void  htmlAvantPageParti() {}

	public void  htmlApresPageParti() {}
}
