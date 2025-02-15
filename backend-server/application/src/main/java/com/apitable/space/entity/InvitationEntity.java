/*
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
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

package com.apitable.space.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * workbench-invitation table.
 * </p>
 *
 * @author Mybatis Generator Tool
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode
@TableName(keepGlobalPrefix = true, value = "invitation")
public class InvitationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * primary key.
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * space id.
     */
    private String spaceId;

    /**
     * team id.
     */
    private Long teamId;

    /**
     * node id.
     */
    private String nodeId;

    /**
     * the creator member id.
     */
    private Long creator;

    /**
     * invite token.
     */
    private String inviteToken;

    /**
     * number of successful invitees.
     */
    private Integer inviteNum;

    /**
     * link status(0:inactivated, 1:activation).
     */
    private Boolean status;

    /**
     * delete marker(0:false,1:true).
     */
    @TableLogic
    private Integer isDeleted;

    /**
     * creation time.
     */
    private LocalDateTime createdAt;

    /**
     * update time.
     */
    private LocalDateTime updatedAt;

}
