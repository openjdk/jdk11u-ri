/*
 * Copyright 2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.sun.tools.internal.xjc.reader.internalizer;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Formats error messages.
 */
class Messages
{
    /** Loads a string resource and formats it with specified arguments. */
    static String format( String property, Object... args ) {
        String text = ResourceBundle.getBundle(Messages.class.getPackage().getName() +".MessageBundle").getString(property);
        return MessageFormat.format(text,args);
    }

    static final String ERR_INCORRECT_SCHEMA_REFERENCE = // args:2
        "Internalizer.IncorrectSchemaReference";
    static final String ERR_XPATH_EVAL = // arg:1
        "Internalizer.XPathEvaluationError";
    static final String NO_XPATH_EVAL_TO_NO_TARGET = // arg:1
        "Internalizer.XPathEvaluatesToNoTarget";
    static final String NO_XPATH_EVAL_TOO_MANY_TARGETS = // arg:2
        "Internalizer.XPathEvaulatesToTooManyTargets";
    static final String NO_XPATH_EVAL_TO_NON_ELEMENT = // arg:1
        "Internalizer.XPathEvaluatesToNonElement";
    static final String XPATH_EVAL_TO_NON_SCHEMA_ELEMENT = // arg:2
        "Internalizer.XPathEvaluatesToNonSchemaElement";
    static final String CONTEXT_NODE_IS_NOT_ELEMENT = // arg:0
        "Internalizer.ContextNodeIsNotElement";
    static final String NO_CONTEXT_NODE_SPECIFIED = // arg:0
            "Internalizer.NoContextNodeSpecified";
    static final String ERR_INCORRECT_VERSION = // arg:0
        "Internalizer.IncorrectVersion";
    static final String ERR_VERSION_NOT_FOUND = // arg:0
        "Internalizer.VersionNotPresent";
    static final String TWO_VERSION_ATTRIBUTES = // arg:0
        "Internalizer.TwoVersionAttributes";
    static final String ORPHANED_CUSTOMIZATION = // arg:1
        "Internalizer.OrphanedCustomization";
    static final String ERR_UNABLE_TO_PARSE = // arg:2
        "AbstractReferenceFinderImpl.UnableToParse";
    static final String ERR_GENERAL_SCHEMA_CORRECTNESS_ERROR = // arg:1
        "ERR_GENERAL_SCHEMA_CORRECTNESS_ERROR";
}