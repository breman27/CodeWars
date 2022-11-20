/**
 * https://www.codewars.com/kata/577ff15ad648a14b780000e7
 */
object Welcome {
  def greet(language: String): String = language match {
    case "english" => "Welcome"
    case "czech" => "Vitejte"
    case "danish" => "Velkomst"
    case "dutch" => "Welkom"
    case "estonian" => "Tere tulemast"
    case "finnish" => "Tervetuloa"
    case "flemish" => "Welgekomen"
    case "french" => "Bienvenue"
    case "german" => "Willkommen"
    case "irish" => "Failte"
    case "italian" => "Benvenuto"
    case "latvian" => "Gaidits"
    case "lithuanian" => "Laukiamas"
    case "polish" => "Witamy"
    case "spanish" => "Bienvenido"
    case "swedish" => "Valkommen"
    case "welsh" => "Croeso"
    case _ => "Welcome"
  }
}