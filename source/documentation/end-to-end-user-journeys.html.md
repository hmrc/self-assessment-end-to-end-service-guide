---
title: End-to-end user journeys | Self Assessment End-to-End Service Guide
weight: 2
---

# End-to-end user journeys

## Agent journey overview 

Agents can use software to help complete and submit a client’s Self Assessment return.

1. [Agent reads guidance](#read-guidance)
2. [Agent creates an HMRC online services for agents account](#create-an-hmrc-online-services-for-agents-account)
3. [Agent registers for Self Assessment for Agents](#register-for-self-assessment-for-agents)
4. [Client registers for Self Assessment](#register-for-self-assessment)
5. [Client authorises agent to act on their behalf](#authorise-agent)
6. [Agent chooses software](#choose-software)
7. [Agent links software to HMRC](#link-software-to-hmrc)
8. [Agent gets details from HMRC to help complete client’s Self Assessment return](#get-details-from-hmrc-to-help-complete-self-assessment-return) (optional)
9. [Agent completes and submits client’s Self Assessment return](#complete-and-submit-self-assessment-return)
10. [Agent gets help and support](#get-help-and-support)


## Individual journey overview 

Individuals can use software to help complete and submit their own Self Assessment return.

1. [Individual reads guidance](#read-guidance)
2. [Individual creates an HMRC online account](#create-an-hmrc-online-account)
3. [Individual registers for Self Assessment](#register-for-self-assessment)
4. [Individual chooses software](#choose-software)
5. [Individual links software to HMRC](#link-software-to-hmrc)
6. [Individual gets details from HMRC to help complete their Self Assessment return](#get-details-from-hmrc-to-help-complete-self-assessment-return) (optional)
7. [Individual completes and submits their Self Assessment return](#complete-and-submit-self-assessment-return)
8. [Individual gets help and support](#get-help-and-support)


## Read guidance 

Agents and individuals can learn about Self Assessment via software by reading guidance pages on GOV.UK.

For agents:

* [Self Assessment for Agents: HMRC online services](https://www.gov.uk/guidance/self-assessment-for-agents-online-service)
* [Self Assessment commercial software suppliers](https://www.gov.uk/government/publications/self-assessment-commercial-software-suppliers/self-assessment-online-commercial-software-suppliers)
* [Use software to help complete your client’s Self Assessment tax return](https://www.gov.uk/guidance/use-software-to-help-complete-your-clients-self-assessment-tax-return)

For individuals:

* [Self Assessment tax returns](https://www.gov.uk/self-assessment-tax-returns)
* [Register for and file your Self Assessment tax return](https://www.gov.uk/log-in-file-self-assessment-tax-return)
* [Self Assessment commercial software suppliers](https://www.gov.uk/government/publications/self-assessment-commercial-software-suppliers/self-assessment-online-commercial-software-suppliers)
* [Use software to help complete your Self Assessment tax return](https://www.gov.uk/guidance/use-software-to-help-complete-your-self-assessment-tax-return)

We encourage you to include links to the relevant guidance in your software.


## Create an HMRC online services for agents account

Agents must create, or already have, an [HMRC online services for agents account](https://www.gov.uk/government/collections/hmrc-online-services-for-agents#HMRC-online-services-for-agents) before they can use the service. This also gives them access to other services for agents.

They can do this on GOV.UK at [HMRC services: sign in or register](https://www.gov.uk/log-in-register-hmrc-online-services). We encourage you to include this link in your software.


## Create an HMRC online account

Individuals must create, or already have, an HMRC online account before they can use the service. This also gives them access to their Personal Tax Account.

They can do this on GOV.UK at [HMRC services: sign in or register](https://www.gov.uk/log-in-register-hmrc-online-services). We encourage you to include this link in your software.


## Register for Self Assessment for Agents

Agents must register for Self Assessment for Agents before they can use this service. This is also known as getting an agent code.

More details are given at [Self Assessment for Agents: HMRC online services](https://www.gov.uk/guidance/self-assessment-for-agents-online-service#how-to-get-an-agent-code). We encourage you to include this link in your software.


## Register for Self Assessment

Individuals must register for Self Assessment before they can use this service.

Individuals with agents must also register for Self Assessment themselves - the agent cannot do it for them.

They can do this on GOV.UK via their Personal Tax Account, which they can access at [HMRC services: sign in or register](https://www.gov.uk/log-in-register-hmrc-online-services). We encourage you to include this link in your software.


## Authorise agent

Agents must obtain authorisation from their clients to act on their behalf before they can use this service.

They can do this on GOV.UK at [Agent authorisation to deal with HMRC](https://www.gov.uk/guidance/client-authorisation-an-overview). We encourage you to include this link in your software.


## Choose software

We provide [a list of Self Assessment software applications](https://www.gov.uk/government/publications/self-assessment-commercial-software-suppliers) so agents and individuals can choose the right software for their needs.


## Link software to HMRC

Agents and individuals using your software to connect to the Self Assessment APIs must grant authority to your software to interact with HMRC on their behalf.

Because the pre-population APIs and the submission API use different technology, the linking process is different for each.

### Link software to HMRC for pre-population APIs

For the pre-population APIs, we use the open standard OAuth 2.0. This involves the agent or individual signing in to their HMRC online account and following our grant authority user journey.

We then generate an access token for the user, which the software must include in subsequent API requests.

For more details see [Authorisation - user restricted endpoints](https://developer.service.hmrc.gov.uk/api-documentation/docs/authorisation/user-restricted-endpoints).
 
### Link software to HMRC for submission API

For the submission API, the agent or individual enters their HMRC online account user ID and password directly into their software.

The software must pass them in subsequent API requests as explained in [Transaction Engine: Document Submission Protocol](https://www.gov.uk/government/publications/transaction-engine-document-submission-protocol).


## Get details from HMRC to help complete Self Assessment return

This step is optional.

The individual or agent’s software can get details from HMRC to help complete some parts of the tax return.

The software can do this by calling one or more of the following APIs:

* [Individual PAYE API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individuals-paye) - recommended for PAYE data, but currently in private beta and will eventually replace the following four Individual APIs
* [Individual Benefits API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-benefits)
* [Individual Employment API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-employment)
* [Individual Income API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-income)
* [Individual Tax API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/individual-tax)
* [National Insurance API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/national-insurance)
* [Marriage Allowance API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/marriage-allowance)

Each API returns either the requested data or an appropriate error response. The most common errors are:

# No data found for the given individual and tax year
# End user not authorised for the given individual, for example an agent without client authorisation

For more details see the above API documentation.

To use these APIs, your application must comply with our [terms of use](https://developer.service.hmrc.gov.uk/api-documentation/docs/terms-of-use). You must accept the terms of use before we issue your application’s production credentials.


## Complete and submit Self Assessment return

Once they have completed the Self Assessment return in their software, the individual or agent submits it to us online. To do this, their software uses the following API:

* [Self Assessment Online XML API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/xml/Self%20Assessment%20Online)


## Get help and support

Individuals and agents can get help and support via the following channels:

* You as their software supplier
* The “Get help with this page” link on relevant pages in the grant authority journey - for help with signing in, 2-step verification, identity checks and granting authority
* The [HMRC Online Services Helpdesk](https://www.gov.uk/government/organisations/hm-revenue-customs/contact/online-services-helpdesk) - for help with technical queries that the software supplier can’t resolve
* The [HMRC Income Tax Helpline](https://www.gov.uk/government/organisations/hm-revenue-customs/contact/income-tax-enquiries-for-individuals-pensioners-and-employees) - for individuals querying the data received from HMRC
* The [HMRC Agent Dedicated Line](https://www.gov.uk/government/organisations/hm-revenue-customs/contact/agent-dedicated-line-self-assessment-or-paye-for-individuals) - for agents querying the data received from HMRC
 
