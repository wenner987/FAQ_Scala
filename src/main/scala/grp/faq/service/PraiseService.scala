package grp.faq.service


trait PraiseService {
  def praise(praiseType: Int, id: Long, uid: Long): Boolean

}
