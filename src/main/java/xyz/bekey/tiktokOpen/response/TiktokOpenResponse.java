package xyz.bekey.tiktokOpen.response;

/**
 * 抖音小店 接口响应 抽象类
 * @param <T> 数据类型
 */
public abstract class TiktokOpenResponse<T> {

    /**
     *  result_code 为 fail 时有
     */
    private Integer err_no;

    private String message;

    private String log_id;

    private T data;

    private String commonParams;

    public String getCommonParams() {
        return commonParams;
    }

    public void setCommonParams(String commonParams) {
        this.commonParams = commonParams;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        // result_code 一定有 err_code不一定有
        return Integer.valueOf(0).equals(err_no);
    }

    public Integer getErr_no() {
        return err_no;
    }

    public void setErr_no(Integer err_no) {
        this.err_no = err_no;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }
}
