package az.onlinecredit.repository.sql;

public class DebtorSql {

    public static String ADD_GUARANTOR =
            " insert into guarantor(full_name , fin_code , phone_number ) " +
                    " values(:full_name ,:fin_code ,:phone_number) ";

    public static String GET_GUARANTOR_BY_FIN_CODE = " select id , full_name ," +
            " fin_code , phone_number " +
            " from guarantor " +
            " where fin_code = ? ";

    public static String ADD_DEBTOR = " insert into debtor ( related_person , phone_number , " +
            " salary , fin_code , guarantor_id ) " +
            " values ( :related_person , :phone_number , :salary ," +
            " :fin_code ,:guarantor_id ) ";

    public static String GET_DEBTOR_BY_FIN_CODE = " select id , related_person , phone_number , " +
            " salary , fin_code , user_id , guarantor_id " +
            " from debtor " +
            " where fin_code = ? ";

}
