package decorator.notification

// 이 클래스는 뭔가를 의존하면 안된다.
class BasicNotifier: Notifier {

    override fun send() {
        println("기본 알림")
    }
}
