package org.computate.enUS.site.page.parti;

import org.computate.enUS.site.cluster.Cluster;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.page.MiseEnPage;
import org.computate.enUS.site.requete.RequeteSiteEnUS;

public abstract class PagePart extends PagePartGen<Cluster> {

	protected void _requeteSite_(Couverture<RequeteSiteEnUS> c) {}

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
