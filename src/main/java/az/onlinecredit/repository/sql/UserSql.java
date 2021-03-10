package az.onlinecredit.repository.sql;

public class UserSql {

    public static String CHECK_EMAIL_EXIST = "select count(email) " +
            "from oc_users " +
            "where email = :email";

    public static String ADD_USER = "insert into oc_users(full_name , email , " +
            " password , registration_date) " +
            " values(:full_name , :email , :password , :registration_date)";

    public static String GET_USER_BY_EMAIL = "select id , full_name ,password, email , " +
                  "  registration_date " +
            "from oc_users " +
            "where email = :email";

    public static String ADD_USER_ROLE = "insert into user_role( user_id , role_id) " +
            "values(:user_id , :role_id)";

    public static String GET_USER_ROLES = "select ur.user_id, u.full_name, ur.role_id, r.user_role " +
            " from user_role ur join oc_users u on ur.user_id = u.id " +
            " join oc_role r on ur.role_id = r.id " +
            " where ur.user_id = :user_id ";
}
