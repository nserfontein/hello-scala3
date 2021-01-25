@main def hello: Unit =
  greet
  whiles("Scala is fun".split(" ").toList)
  echoargs("Scala is even more fun".split(" ").toList)
  iterates("Scala is even more fun functionally".split(" ").toList)
  fors("Scala is even more fun functionally".split(" ").toList)

def greet = 
  println("Scala is fun")

def whiles(args: List[String]) =
  var i = 0
  while i < args.length do
    println(args(i))
    i += 1

def echoargs(args: List[String]) =
  var i = 0
  while i < args.length do
    if i != 0 then
      print(" ")
    print(args(i))
    i += 1
  println()

def iterates(args: List[String]) =
  args.foreach(println)

def fors(args: List[String]) =
  for arg <- args do
    println(arg) 

