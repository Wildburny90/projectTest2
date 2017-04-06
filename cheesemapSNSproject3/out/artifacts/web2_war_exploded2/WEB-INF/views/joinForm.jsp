<!-- joinform Grid Section -->
<section id="join">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>Join Us</h2>
				<hr class="star-primary">
			</div>
		</div>
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<form action="join" method="post" onsubmit="return joinFormCheck();" enctype="multipart/form-data">
					<div class="row control-group">
						<div class="form-group col-xs-12 floating-label-form-group controls">
							<label for="id" id="idLabel">ID</label>
							<input type="email" class="form-control" placeholder="E-mail" id="idJoin" name="mem_id" required data-validation-required-message="Please enter your ID.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row control-group">
						<div class="form-group col-xs-12 floating-label-form-group controls">
							<label for="password">password</label>
							<input type="password" class="form-control" placeholder="Password" id="passwordJoin" name="mem_pw" required data-validation-required-message="Please enter your Password.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row control-group">
						<div class="form-group col-xs-12 floating-label-form-group controls">
							<label for="passwordCheck">password check</label> <input type="password" class="form-control" placeholder="Please enter the same password again" id="passwordCheck" required data-validation-required-message="Please enter your Password.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row control-group">
						<div class="form-group col-xs-12 floating-label-form-group controls">
							<label for="birth">Birth</label> <input type="text" class="form-control" placeholder="Date of birth" id="birth" name="mem_birth" required data-validation-required-message="Please enter your date of birth.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row control-group">
						<div class="form-group col-xs-12 floating-label-form-group controls">
							<label for="nickname" id="nnLabel">Nickname</label>
							<input type="text" class="form-control" placeholder="Nickname" id="nickname" name="mem_nickname" required data-validation-required-message="Nickname">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row control-group">
						<div class="form-group col-xs-12 floating-label-form-group controls coco">
							<span class="genderSection" id="gender">Gender</span>
							<span class="genderSection gender_sub">
							<input type="radio"	name="mem_gender" value="Male" checked>Male</span>
							<span class="genderSection gender_sub">
							<input type="radio"	name="mem_gender" value="Female">Female</span>
							<span> 
								<span id="imgDiv">
									<img id="userPhoto" src="http://placehold.it/150x170">
								</span>
								<input type="file" id="upload" name="originalfile">
							</span>
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<br>
					<div class="row control-group">
						<input type="submit" class="btn btn-success btn-lg"	value="Join">
					</div>
				</form>
			</div>
		</div>
	</div>
</section>
