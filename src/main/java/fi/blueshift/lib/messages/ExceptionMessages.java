package fi.blueshift.lib.messages;

public class ExceptionMessages {
    public static final String TRANSACTION_FETCHING_EXCEPTION = "There is no transaction with specified params '%s'";
    public static final String SWAPS_FETCHING_EXCEPTION = "There is no swaps with specified params '%s'";
    public static final String DEPOSITS_FETCHING_EXCEPTION = "There is no deposits with specified params '%s'";
    public static final String WITHDRAWS_FETCHING_EXCEPTION = "There is no withdraw with specified params '%s'";
    public static final String PORTFOLIO_FETCHING_EXCEPTION = "There is no portfolio with specified params '%s'";
    public static final String TOKEN_FETCHING_EXCEPTION = "There is no token with specified params '%s'";
    public static final String BUNDLE_FETCHING_EXCEPTION = "There is no prices (bundle) with specified params '%s'";
    public static final String STATISTIC_PORTFOLIO_FETCHING_EXCEPTION = "There is no portfolio statistic with specified params '%s'";
    public static final String STATISTIC_SUMMARY_FETCHING_EXCEPTION = "There is no summary statistic with specified params '%s'";
    public static final String STATISTIC_TOKEN_FETCHING_EXCEPTION = "There is no token statistic with specified params '%s'";
    public static final String STATISTIC_TOTAL_SUMMARY_FETCHING_EXCEPTION = "There is no total summary statistic with specified params '%s'";
    public static final String SUPPORTED_NETWORK_FETCHING_EXCEPTION = "There is no supported network with specified params '%s'";
    public static final String HEALTH_FETCHING_EXCEPTION = "There is no network (chain) status for specified params '%s'";

    //    public static final String FORBIDDEN_ERROR = "Need proper permission to access. Please try login";
//    public static final String VALIDATION_ERROR = "Unacceptable arguments. Please check request parameters";
//    public static final String METHOD_ARGUMENT_VALIDATION_ERROR = "Method argument not valid";
//    public static final String ENTITY_NOT_FOUND_ERROR = "Entity not found. Please check request parameters";
//    public static final String REQUEST_MESSAGE_READABLE_ERROR = "Malformed JSON Request. Please check request parameters";
//    public static final String UNEXPECTED_ERROR = "Unexpected error occurred. Please check stacktrace";
    public static final String FEIGN_UNEXPECTED_ERROR = "Some error with service connections. Try again";
//
//    public static final String CURRENCY_SYMBOL_NOT_FOUND_ERROR = "The currency symbol was not found in the system. Please check and add it in CurrencySymbolType class.";
//    public static final String LOAD_DATA_FROM_EXTERNAL_PROVIDER_ERROR = "The data from external provider can't be received or parsed. Check stack trace.";
}
