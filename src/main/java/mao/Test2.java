package mao;

import java.util.Optional;

/**
 * Project name(项目名称)：JDK8_Optional
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/27
 * Time(创建时间)： 16:58
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        System.out.println(Optional.of("123").get());
        System.out.println(Optional.of("22").isPresent());
        System.out.println(Optional.of(null).isPresent());
        Optional.of(null).get();
    }
}
