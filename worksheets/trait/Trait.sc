object Trait {
  val person = new Person("Ted", "Steele") with Speaker
  person.speak("Hello my name is " + person.firstName)
  //person.greet()

  val otherPerson = new Person("Ted", "Steele") with Speaker with Greeter
  otherPerson.greet()
}

class Person(val firstName: String, val lastName:String)

trait Speaker {
  def speak(sentences: String) = println(sentences)
}

trait Greeter { person: Person with Speaker => //self-type
def greet() = speak("Hi, My name is " + person.firstName)
}