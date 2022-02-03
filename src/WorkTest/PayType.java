package WorkTest;

public enum PayType {

    SCAP("신용카드", "CA"),
    SVAP("가상계좌", "VA"),
    SRAP("계좌이체","RA"),
    SHMP("해피머니","HM"),
    SBGP("문화상품권","BG"),
    STCP("틴캐시", "TC"),
    PAYC("페이코","PZ"),
    KKOP("카카오페이","PZ");


    private String svcNm;
    private String method;

    PayType(String svcNm, String method){
        this.svcNm = svcNm;
        this.method = method;
    }

    public String getSvcNm(){
        return svcNm;
    }

    public String getMethod() {
        return method;
    }
}
