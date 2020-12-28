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
            " salary , fin_code , guarantor_id " +
            " from debtor " +
            " where fin_code = ? ";

    public static String GET_DEBTOR_RESULT_BY_FIN_CODE = "select related_person , d.phone_number debtor_phone_number," +
            " salary , d.fin_code debtor_fin_code , " +
            "full_name guarantor_name , g.fin_code guarantor_fin_code  ,g.phone_number guarantor_phone_number " +
            "from guarantor g join debtor d on d.guarantor_id = g.id " +
            "where d.fin_code = ? ";

    public static String CHECK_GUARANTOR_EXISTS = " select count(*) " +
            " from guarantor " +
            " where fin_code = :fin_code";

    public static String CHECK_CUSTOMER_EXISTS = " select count(*) " +
            " from debtor " +
            " where fin_code = :fin_code";

}
