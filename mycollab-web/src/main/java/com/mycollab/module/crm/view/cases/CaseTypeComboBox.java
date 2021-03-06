/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.crm.view.cases;

import com.mycollab.module.crm.CrmDataTypeFactory;
import com.mycollab.vaadin.web.ui.I18nValueComboBox;
import com.mycollab.vaadin.web.ui.ValueComboBox;

import java.util.Arrays;

/**
 * @author MyCollab Ltd
 * @since 1.0.0
 */
public class CaseTypeComboBox extends I18nValueComboBox {
    private static final long serialVersionUID = 1L;

    public CaseTypeComboBox() {
        setCaption(null);
        this.loadData(Arrays.asList(CrmDataTypeFactory.casesType));
    }
}
