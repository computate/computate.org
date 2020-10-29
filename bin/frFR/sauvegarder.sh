#!/bin/bash
echo "Watch the $appliNom project here: $appliChemin"
cd $appliComputateChemin
rm -rf "$appliChemin/backup/backup-solr-$appliNom"
curl 'http://localhost:8983/solr/admin/collections?action=BACKUP&name=backup-solr-computateorg&loca
tion=/home/ctate/backup&collection=computateorg&maxShardsPerNode=1'

