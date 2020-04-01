# SpringDataDao

Lecture et insertion en base de données avec Spring et JPA avec un conteneur .XML

  -TestSpringJPA : test de la couche DAO
  -TestSpringService : test couche service faisant appel à la couche DAO.
  
  
Methodo
  1/ créer projet maven quickstart
2/ ajouter dependances framework
3/ créer interface dao
4/ créer le fichier conteneur
5/ ajouter les différents beans (ppc, datasource,emf,transaction manager,jpa repository)
6/ tester Dao avec une classe de test create + findBy
7/ coder le service
8/ déclarer le service dans le conteneur et mettre en propriete l'interface
9/ mettre en place l'auto cablage du dao
10/ tester service avec une classe de test create + findBy
