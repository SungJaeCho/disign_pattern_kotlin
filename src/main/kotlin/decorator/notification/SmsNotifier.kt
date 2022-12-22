package decorator.notification

class SmsNotifier(
    private val notifier: Notifier? // 컴포지션
): Notifier {

    constructor(): this(
        null
    )

    override fun send() {
        notifier?.send()
        println("문자 알림")
    }
}
