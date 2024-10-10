package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10; // 10% 할인

    @Override
    public int discount(hello.core.member.Member member, int price) {
        if (member.getGrade() == hello.core.member.Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
