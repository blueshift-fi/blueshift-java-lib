package fi.blueshift.lib.config;

public class BluesChainApiRoutes {
    /**
     * Get token amount out and route for specified token amount in (SELL)
     */
    public static final String GET_SWAP_ROUTE_AND_AMOUNT_OUT_FOR_AMOUNT_IN_PATH =
            "/dex/exact_in_routes/chain_id_from/{chainIdIn}/token_address_from/{tokenAddressIn}/chain_id_to/{chainIdOut}/token_address_to/{tokenAddressOut}/amount_in/{amountDecimalsIn}/max_hops/{maxHopsNum}/local_priority/{isLocalPriority}";

    /**
     * Get token amount in and route for specified token amount out (BUY)
     */
    public static final String GET_SWAP_ROUTE_AND_AMOUNT_IN_FOR_AMOUNT_OUT_PATH =
            "/dex/exact_out_routes/chain_id_from/{chainIdIn}/token_address_from/{tokenAddressIn}/chain_id_to/{chainIdOut}/token_address_to/{tokenAddressOut}/amount_out/{amountDecimalsOut}/max_hops/{maxHopsNum}/local_priority/{isLocalPriority}";
}
