package readjson;

public class OneQuery {
    private String query;
    private String parameters;
    private String domain;
    private String merchant_id;

    public OneQuery(String query, String parameters, String domain, String merchant_id) {
        this.query = query;
        this.parameters = parameters;
        this.domain = domain;
        this.merchant_id = merchant_id;
    }

    public OneQuery() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    @Override
    public String toString() {
        return "readjson.OneQuery{" +
                "query='" + query + '\'' +
                ", parameters='" + parameters + '\'' +
                ", domain='" + domain + '\'' +
                ", merchant_id='" + merchant_id + '\'' +
                '}';
    }
}
