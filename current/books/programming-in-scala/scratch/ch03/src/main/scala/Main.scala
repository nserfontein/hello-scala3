@main def hello: Unit =
  greetStrings1
  greetStrings2
  tuples
  yields

def greetStrings1: Unit =
  val greetStrings = new Array[String](3)
  greetStrings.update(0, "Hello")
  greetStrings.update(1, ", ")
  greetStrings.update(2, "world!\n")
  for i <- 0 to 2 do
    print(greetStrings.apply(i))

def greetStrings2: Unit =
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"
  for i <- 0 to 2 do
    print(greetStrings(i))

def tuples =
  val pair = (99, "Luftballons")
  val num = pair(0) // type Int, value 99
  val what = pair(1) // type String, value "Luftballons"
  println(s"$num $what")

def yields =
  val adjectives = List("One", "Two", "Red", "Blue")
  val nouns =
    for adj <- adjectives yield
      adj + " Fish"


