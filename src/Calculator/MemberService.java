package Calculator;

public class MemberService {
    boolean login(String id, String password) {
        boolean flag = false;
        if(id.equals("hong")&&password.equals("12345")) flag = true;
        return flag;
    }

    void logout(String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
