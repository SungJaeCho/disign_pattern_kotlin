package decorator

import decorator.notification.BasicNotifier
import decorator.notification.EmailNotifier
import decorator.notification.Notifier
import decorator.notification.SmsNotifier

/**
 * 데코레이터 패턴 (장식)
 * (A) -> B(A) -> C(B(A))
 */
class App {
}

fun main() {
//    val notifier : Notifier = BasicNotifier()
//    notifier.send()

//    val emailNotifier : Notifier = EmailNotifier(BasicNotifier())
//    emailNotifier.send()

//    val smsNotifier : Notifier = SmsNotifier(BasicNotifier())
//    smsNotifier.send()

    // 1. 전체알림 ( 기본->이메일->문자 )
    val allNotifier : Notifier = SmsNotifier(EmailNotifier(BasicNotifier()))
    allNotifier.send()

    println("-------------------------------------------------------------")

    // 2. 전체알림 ( 기본->문자->이메일 )
    val allNotifier2 : Notifier = EmailNotifier(SmsNotifier(BasicNotifier()))
    allNotifier2.send()

    println("-------------------------------------------------------------")

    // 3. 이메일 단건알림
    val emailNotifier : Notifier = EmailNotifier()
    emailNotifier.send()

    println("-------------------------------------------------------------")

    // 4. SMS 단건알림
    val smsNotifier : Notifier = SmsNotifier()
    smsNotifier.send()

    println("-------------------------------------------------------------")


    // 5. 문자 + 이메일 알림
    val smsEmailNotifier : Notifier = SmsNotifier(EmailNotifier())
    smsEmailNotifier.send()

    println("-------------------------------------------------------------")
}
