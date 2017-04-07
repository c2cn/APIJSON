/*Copyright ©2016 TommyLemon(https://github.com/TommyLemon)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package apijson.demo.client.server.model;

import zuo.biao.apijson.APIJSONRequest;
import zuo.biao.apijson.BaseModel;
import zuo.biao.apijson.RequestMethod;

/**评论类
 * @author Lemon
 */
@APIJSONRequest(
		method = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
		DELETE = "{necessaryColumns:id}"
		)
public class Comment extends BaseModel {
	private static final long serialVersionUID = -1011007127735372824L;
	
	private Long toId;
	private Long userId;
	private Long momentId;
	private String content;
	public Comment() {
		super();
	}
	public Comment(long id) {
		this();
		setId(id);
	}
	

	public Long getToId() {
		return toId;
	}
	public Comment setToId(Long toId) {
		this.toId = toId;
		return this;
	}
	public Long getUserId() {
		return userId;
	}
	public Comment setUserId(Long userId) {
		this.userId = userId;
		return this;
	}
	public Long getMomentId() {
		return momentId;
	}
	public Comment setMomentId(Long momentId) {
		this.momentId = momentId;
		return this;
	}
	public String getContent() {
		return content;
	}
	public Comment setContent(String content) {
		this.content = content;
		return this;
	}

}