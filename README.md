# **Gestion simplifiée d'une bibliothèque**

## **Objectif**
Le but de ce projet est de mettre en pratique les concepts de **généricité** et **accès aux bases de données**. Ce petit projet couvre des compétences de base en programmation, gestion de données et manipulation de la généricité, tout en étant réalisable dans un délai court.

---

## **Description du projet**
Cette application permet de gérer des livres et des utilisateurs dans une bibliothèque à travers diverses fonctionnalités. 

### **Fonctionnalités principales :**
1. **Gestion des livres :**
   - Ajout, modification et suppression de livres.
   - Chaque livre dispose des attributs suivants : titre, auteur, année de publication, genre.

2. **Gestion des utilisateurs :**
   - Ajout, modification et suppression d'utilisateurs.
   - Chaque utilisateur dispose des informations suivantes : nom, email, numéro de téléphone.

3. **Système de prêt de livres :**
   - Les utilisateurs peuvent emprunter et rendre des livres.
   - Gestion des dates de prêt et de retour.

4. **Recherche avancée de livres :**
   - Recherche par auteur, genre ou autres critères.

5. **Gestion des pénalités :**
   - Système pour calculer et gérer les pénalités pour les retours de livres en retard.

---

## **Concepts utilisés**

### 1. **Généricité :**
- Création de classes génériques pour gérer les objets de la bibliothèque.  
  Exemple : une classe **`Repository<T>`** pour les opérations CRUD (Create, Read, Update, Delete) sur des entités telles que **Livre** et **Utilisateur**.
- Utilisation de la généricité pour gérer les collections d'objets de manière flexible et réutilisable.

### 2. **Accès à la base de données :**
- Utilisation d'une base de données relationnelle pour stocker les informations sur les livres, les utilisateurs et les prêts.
- Implémentation de requêtes SQL pour effectuer les opérations CRUD.
- Utilisation de **JDBC (Java Database Connectivity)** ou d'autres outils/bibliothèques pour la gestion des bases de données.

---

## **Structure technique**

### **Base de données :**
Le projet utilise une base de données relationnelle avec trois tables principales :

1. **Livres :**  
   - Colonnes : `id`, `titre`, `auteur`, `annee`, `genre`.

2. **Utilisateurs :**  
   - Colonnes : `id`, `nom`, `email`, `telephone`.

3. **Prêts :**  
   - Colonnes : `id`, `utilisateur_id`, `livre_id`, `date_emprunt`, `date_retour`.

---

## **Configuration et lancement**

### **1. Prérequis :**
- **JDK 8 ou supérieur**
- Une base de données relationnelle (par exemple : MySQL, PostgreSQL, etc.).
- **JDBC Driver** pour la base de données choisie.
- Outil de gestion de projet Java tel que **Maven** ou **Gradle**.

### **2. Étapes d'installation :**
1. **Cloner le dépôt du projet :**
   ```bash
   git clone <url_du_repositoire>
   cd gestion-bibliotheque
   ```

2. **Configurer la base de données :**
   - Créez une base de données avec les trois tables mentionnées dans la structure technique.
   - Mettez à jour les informations de connexion dans le fichier de configuration (par exemple : `application.properties`).

3. **Construire et exécuter le projet :**
   - Si vous utilisez Maven :
     ```bash
     mvn clean install
     mvn exec:java
     ```

---