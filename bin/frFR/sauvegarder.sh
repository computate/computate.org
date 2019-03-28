#!/bin/bash
echo "Watch the $appliNom project here: $appliChemin"
cd $appliComputateChemin
rm -rf "$appliChemin/backup/backup-$DAY_OF_WEEK-solr-$appliNom"
curl 'http://localhost:10383/solr/admin/collections?action=BACKUP&name=backup-'"$DAY_OF_WEEK"'-solr-computateorg&loca
tion=/home/ctate/backup&collection=computateorg&maxShardsPerNode=1'

