package az.onlinecredit.repository.sql;

public class UserSql {

    public static String CHECK_EMAIL_EXIST = "select count(email) " +
            "from users " +
            "where email = :email";

    public static String ADD_USER = "insert into users(full_name , email , " +
            " password , registration_date) " +
            " values(:full_name , :email , :password , :registration_date)";

    public static String GET_USER_BY_EMAIL = "select id , full_name , email , " +
                  " password , registration_date " +
            "from users " +
            "where email = ?";

    public static String ADD_USER_ROLE = "insert into user_role( user_id , role_id) " +
            "values(:user_id , :role_id)";
}
