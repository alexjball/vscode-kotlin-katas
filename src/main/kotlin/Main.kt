fun main(args: Array<String>) {
    println(HelloWorld(if (args.size > 0) args[0] else "World").speak())
}
