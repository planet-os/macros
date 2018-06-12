package com.planetos.macros


object LoggingMacro {
  import scala.reflect.macros.blackbox.Context

  def debug(c: Context)(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isDebugEnabled) $log.debug($msg)"
  }

  def debugT(c: Context)(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isDebugEnabled) $log.debug($msg, $t)"
  }

  def info(c: Context)(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isInfoEnabled) $log.info($msg)"
  }

  def infoT(c: Context)(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isInfoEnabled) $log.info($msg, $t)"
  }

  def warn(c: Context)(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isWarnEnabled) $log.warn($msg)"
  }

  def warnT(c: Context)(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isWarnEnabled) $log.warn($msg, $t)"
  }

  def error(c: Context)(msg: c.Expr[String]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isErrorEnabled) $log.error($msg)"
  }

  def errorT(c: Context)(msg: c.Expr[String], t: c.Expr[Throwable]): c.universe.Tree = {
    import c.universe._
    val log = q"${c.prefix}.log"
    q"if ($log.isErrorEnabled) $log.error($msg, $t)"
  }
}
