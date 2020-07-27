package xyz.bekey.tiktokOpen.response;

public class ErrorResponse extends TiktokOpenResponse<Object> {

    public ErrorResponse() {
        super();
        setErr_no(99);
        setMessage("查看日志");
    }

}
