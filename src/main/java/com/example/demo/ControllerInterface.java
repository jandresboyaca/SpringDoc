package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


public interface ControllerInterface {
        @Operation(summary = "Obtener un usuario por ID")
        @ApiResponse(content = @Content(examples = @ExampleObject(name = "200", ref = "#/components/examples/login")))
        String test(int id);


}
