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
package org.impressivecode.depress.its.jiraonline.model;

import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Model class used by Jackson for Jira JSON parsing.
 * 
 * @author Marcin Kunert, Wroclaw University of Technology
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JiraOnlineIssueChanges {

    @JsonProperty("author")
    private JiraOnlineUser author;

    @JsonProperty("items")
    private List<JiraOnlineIssueChange> items;
    
    @JsonProperty("created")
    private Date timestamp;

    public JiraOnlineUser getAuthor() {
        return author;
    }

    public void setAuthor(JiraOnlineUser author) {
        this.author = author;
    }

    public List<JiraOnlineIssueChange> getItems() {
        return items;
    }

    public void setItems(List<JiraOnlineIssueChange> items) {
        this.items = items;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
