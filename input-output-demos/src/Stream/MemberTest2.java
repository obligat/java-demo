package Stream;

import java.io.IOException;
import static java.lang.System.out;

public class MemberTest2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Member2[] members = {
            new Member2("B1231", "Justion", 32),
            new Member2("B5343", "Meey", 23),
            new Member2("B3232", "Idwe", 33)
        };

        for (Member2 member : members) {
            member.save();
        }

        out.println(Member2.load("B1231"));
        out.println(Member2.load("B5343"));
        out.println(Member2.load("B1231"));
    }
}


//(B1231 , Justion , 32 )
//(B5343 , Meey , 23 )
//(B1231 , Justion , 32 )