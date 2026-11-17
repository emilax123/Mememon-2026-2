package cl.uchile.dcc
package model

import cl.uchile.dcc.model.actions.Action
import munit.FunSuite

import java.nio.charset.StandardCharsets

class SourceTest extends FunSuite:
  class TestAction extends Action {
    var executed = false
    override def id: String = "Test"
  }
  
  class TestSource extends Source {
    var excuted = false

    override def actions: List[Action] = List(TestAction)
  }