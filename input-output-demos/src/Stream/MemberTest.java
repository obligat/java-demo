package Stream;

import java.io.IOException;
import static java.lang.System.out;

public class MemberTest {

    public static void main(String[] args) throws IOException {

        Member[] members = {
            new Member("B1231", "Justion", 32),
            new Member("B5343", "Meey", 23),
            new Member("B3232", "Idwe", 33)
        };

        for (Member member : members) {
            member.save();
        }

        out.println(Member.load("B1231"));
        out.println(Member.load("B5343"));
        out.println(Member.load("B3232"));
    }
}


//(B1231 , Justion , 32 )
//(B5343 , Meey , 23 )
//(B3232 , Idwe , 33 )