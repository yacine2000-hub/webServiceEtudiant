
# Explications: Apres savoir faire les dataBindinding on utilise StudentController pour fair les webservices REST:
Ce contrôleur Java utilise Spring Boot, un framework Java pour créer des applications Java rapidement et avec moins de configuration.
# @RestController indique que cette classe est un contrôleur REST, ce qui signifie qu'elle répondra aux requêtes HTTP avec des données JSON.
# @RequestMapping("") spécifie que toutes les routes définies dans cette classe commencent par une chaîne de caractères vide dans l'URL de base. Cela signifie que les endpoints commenceront par http://localhost:8090/.
# La classe StudentController a un constructeur qui prend un objet Studentservices en argument. Cela indique une injection de dépendance pour utiliser les services liés aux étudiants.
# Les méthodes annotées avec @GetMapping, @PostMapping, et @DeleteMapping définissent les opérations CRUD pour les entités Student.
getAllStudents() retourne une liste de tous les étudiants.
getStudentsById(Long id) retourne un étudiant spécifique en fonction de son ID.
createStudents(Studentdto studentdto) crée un nouvel étudiant en utilisant les données fournies dans le corps de la requête.
deleteStudent(Long id) supprime un étudiant en fonction de son ID.
@PathVariable est utilisé pour extraire les paramètres de l'URL de la requête.
@requestbody indique que les données JSON de la requête doivent être désérialisées dans l'objet Studentdto.
# On utilise Postman pour faire le test  de nos methodes
