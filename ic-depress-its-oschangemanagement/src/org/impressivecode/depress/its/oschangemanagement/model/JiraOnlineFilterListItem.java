/*
 ImpressiveCode Depress Framework
 Copyright (C) 2013  ImpressiveCode contributors
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.impressivecode.depress.its.oschangemanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model class used by Jackson for Jira JSON parsing. Generalized type of JIRA
 * custom field list item.
 * 
 * @author Krzysztof Kwoka, Wroc³aw University of Technology
 * @author Maciej Borkowski, Capgemini Poland
 * 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class JiraOnlineFilterListItem {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}