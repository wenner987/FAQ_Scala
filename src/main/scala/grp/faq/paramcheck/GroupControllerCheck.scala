package grp.faq.paramcheck

trait GroupControllerCheck {
  @throws[Exception]
  def checkNameAndDesc(name: String, desc: String)

  @throws[Exception]
  def checkId(id: String)

  @throws[Exception]
  def checkIndex(index: String)
}