package grp.faq.paramcheck;

public interface GroupControllerCheck {

    Boolean checkNameAndDesc(String name, String desc) throws Exception;

    Boolean checkId(String id) throws Exception;

    Boolean checkIndex(String index) throws  Exception;

}
