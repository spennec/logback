/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2009, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package chapters.appenders.onJoran.implicit;

import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Pattern;

/**
 * 
 * A rather trivial implicit action which is applicable if an element has a
 * printme attribute set to true.
 * 
 * @author Ceki G&uuml;lc&uuml;
 */
public class PrintMeImplicitAction extends ImplicitAction {

  public boolean isApplicable(Pattern pattern, Attributes attributes,
      InterpretationContext ec) {
    String printmeStr = attributes.getValue("printme");

    return Boolean.valueOf(printmeStr).booleanValue();
  }

  public void begin(InterpretationContext ec, String name, Attributes attributes) {
    System.out.println("Element [" + name + "] asked to be printed.");
  }

  public void end(InterpretationContext ec, String name) {
  }
}
