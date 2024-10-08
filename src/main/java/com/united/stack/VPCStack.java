package com.united.stack;

import lombok.Getter;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.amazon.awscdk.services.ec2.VpcProps;
import software.constructs.Construct;

@Getter
public class VPCStack extends Stack {

    private final Vpc vpc;

    public VPCStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);
        this.vpc = new Vpc(this, "VPC", VpcProps.builder()
                .vpcName("ECommerceVPC")
                .maxAzs(2)
                //.natGateways(0)
                .build());
    }
}
