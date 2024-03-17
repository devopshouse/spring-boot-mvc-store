package demo.shopapi.exception;


import demo.shopapi.enums.ResultEnum;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public class MyException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1463518878850998160L;
	private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
