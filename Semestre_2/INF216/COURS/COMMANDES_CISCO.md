Liste des commandes show
� La commande show running-config (ou show run) est probablement la plus utile pour
d�terminer l��tat en cours d�un routeur, car elle affiche la configuration courante qui est stock�e dans un
fichier activ� en m�moire RAM.
� La commande show startup-config (ou show start) affiche le contenu du fichier de la
configuration de sauvegarde enregistr� dans la m�moire non volatile ou NVRAM. Ce fichier permet de
configurer le routeur lors du d�marrage ou du red�marrage de celui-ci � l�aide de la commande reload. Il
contient le param�trage d�taill� des interfaces du routeur.
� show flash est utilis�e pour afficher la m�moire flash disponible et la quantit� utilis�e. La
m�moire Flash contient la plate-forme logicielle Cisco IOS (Internetwork Operating System), aussi
appel�e image.
� show arp affiche la table arp du routeur (ou le cache arp) qui met en correspondance les
adresses IP et les adresses MAC pour tous les h�tes connect�s aux interfaces du routeur. Le mappage
des adresses IP avec les adresses MAC de chaque interface est inclus dans la table arp.
� show interface brief affiche l��tat de toutes les interfaces configur�es sur le routeur.
Faites la correspondance entre les interfaces de votre routeur et les informations donn�es par la
commande show interface brief.
� La commande show protocol affiche l'�tat g�n�ral des protocoles de couche 3 configur�s (IP,
IPX, etc.), ainsi qu'un �tat de ces protocoles pour chaque interface.