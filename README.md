 HEAD
# calculatrice-cli

# Calculatrice CLI — TP Développement collaboratif et intégration continue

Projet Java 17 / Maven : addition et soustraction de deux nombres réels depuis le terminal.

## Prérequis
- JDK 17 ou supérieur
- Maven 3.8+
- Git

## Exécution
```bash
mvn clean test
mvn clean verify
mvn exec:java -Dexec.mainClass=dz.univ.calculatrice.Main
```
Si le plugin exec n'est pas installé, lancer la classe `Main` depuis l'IDE après compilation.

## Fonctionnalités
- Addition (`AddOperation`)
- Soustraction (`SubtractOperation`)
- Interface CLI (`Main`)
- Tests unitaires JUnit 5
- Contrôle Checkstyle pendant `mvn verify`
- GitHub Actions sur push et pull request

## Hooks Git
Après clonage, exécuter une fois :
```bash
git config core.hooksPath .githooks
```
Sous Git Bash, rendre les hooks exécutables :
```bash
chmod +x .githooks/pre-commit .githooks/pre-push
```

## Travail collaboratif
Créer deux branches séparées : `feature/addition` et `feature/soustraction`.
Chaque étudiant développe et teste sa fonctionnalité, pousse sa branche, puis ouvre une Pull Request vers `main`.
Ne jamais partager son mot de passe ou token GitHub.
>>>>>>> 9ff7985 (initial commit)
