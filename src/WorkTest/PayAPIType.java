package WorkTest;

import java.util.Arrays;
import java.util.List;

public enum PayAPIType {

    CA("신용카드", "CA", Arrays.asList(PayType.SCAP)),
    VA("가상계좌", "VA", Arrays.asList(PayType.SVAP)),
    RA("계좌이체", "RA", Arrays.asList(PayType.SRAP)),
    HM("해피머니", "GC", Arrays.asList(PayType.SHMP)),
    BG("문화상품권", "GC", Arrays.asList(PayType.SBGP)),
    TC("틴캐시", "GC", Arrays.asList(PayType.STCP)),
    PZ("간편결제", "PZ", Arrays.asList(PayType.KKOP, PayType.PAYC))
    ;

    private String svcNm;
    private String tableDiv;
    private List<PayType> svcList;

    PayAPIType(String svcNm, String tableDiv, List<PayType> svcList){
        this.svcNm = svcNm;
        this.tableDiv = tableDiv;
        this.svcList = svcList;
    }


    public String getTableDiv() {
        return tableDiv;
    }

    public String getSvcNm(){
        return svcNm;
    }

    public List<PayType> getSvcList() {
        return svcList;
    }
}
