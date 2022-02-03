package WorkTest;

import java.util.Arrays;
import java.util.List;

public enum PayGroupAdvanced {


    CA("신용카드", Arrays.asList(PayType.SCAP), Arrays.asList(PayType.SCAP.getMethod())),
    VA("가상계좌", Arrays.asList(PayType.SVAP), Arrays.asList(PayType.SVAP.getMethod())),
    GC("상품권", Arrays.asList(PayType.SHMP, PayType.SBGP, PayType.STCP)
            , Arrays.asList(PayType.SHMP.getMethod(), PayType.SBGP.getMethod(), PayType.STCP.getMethod())),
    EZP("간편결제", Arrays.asList(PayType.KKOP, PayType.PAYC)
            , Arrays.asList(PayType.KKOP.getMethod(), PayType.PAYC.getMethod()))
    ;

    private String tableDivNm;
    private List<PayType> payList;
    private List<String> method;

    PayGroupAdvanced(String tableDivNm, List<PayType> payList, List<String> method){
        this.tableDivNm = tableDivNm;
        this.payList = payList;
        this.method = method;
    }

    public static PayGroupAdvanced findPayType(PayType payType){
        return Arrays.stream(PayGroupAdvanced.values())
                .filter(payGroup -> payGroup.hasSvcCd(payType))
                .findAny()
                .orElse(null);
    }


    public boolean hasSvcCd(PayType payType){
        return payList.stream()
                .anyMatch(pay -> pay == payType);
    }


    public static PayGroupAdvanced findMethod(PayType payType){
        return Arrays.stream(PayGroupAdvanced.values())
                .filter(payGroup -> payGroup.hasMethod(payType))
                .findAny()
                .orElse(null);
    }


    public boolean hasMethod(PayType payType){
        return method.stream()
                .anyMatch(method -> method == payType.getMethod());
    }




    public String getTableDivNm() {
        return tableDivNm;
    }

    public List<PayType> getPayList() {
        return payList;
    }
}
