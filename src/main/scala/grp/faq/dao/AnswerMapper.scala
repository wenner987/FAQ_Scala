package grp.faq.dao

import grp.faq.entity.Answer

trait AnswerMapper {
  def getTodayAnswer(): Long
}