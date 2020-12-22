package az.onlinecredit.repository.sql;

public class CreditSql {

    public static String ADD_CREDIT = " insert into credit (" +
            "base_amount , interest_rate , period_with_month , start_date ," +
            " end_date , status , fin_code ) " +
            " values(:base_amount , :interest_rate ,:period_with_month ," +
            " :start_date , :end_date , :status , :fin_code) ";

    public static String GET_CREDIT_BY_FIN_CODE = " select * " +
            "from credit " +
            "where fin_code = ? ";

    public static String ADD_PAYMENT = "insert into payment(general_payment , monthly_payment ," +
            " credit_id , fin_code)" +
            " values(:general_payment , :monthly_payment , :credit_id , :fin_code) ";

    public static String GET_CREDIT_RESULT_LIST = "select base_amount , interest_rate ,general_payment , " +
            " monthly_payment , period_with_month , start_date , end_date , c.fin_code , status " +
            " from payment p join credit c on p.credit_id = c.id";

    public static String GET_CREDIT_RESULT_BY_FIN_CODE = "select base_amount , interest_rate ,general_payment , " +
            " monthly_payment , period_with_month , start_date , end_date , c.fin_code , status " +
            " from payment p join credit c on p.credit_id = c.id " +
            " where c.fin_code = ?";
}
