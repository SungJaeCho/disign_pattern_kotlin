package decorator.notification

class EmailNotifier(
    private val notifier: Notifier?
): Notifier {

    constructor() : this(
        null
    )

    override fun send() {
        notifier?.send()
        println("이메일 알림")
    }
}
